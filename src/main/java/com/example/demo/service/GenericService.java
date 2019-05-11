/**
 * 
 */
package com.example.demo.service;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;

import com.mysql.cj.util.DataTypeUtil;

/**
 * @author Danger
 *
 */
public class GenericService {

	public static void copyProperties(Object destinationDO, Object originationDO) throws Exception {

		Class<?> orgiClass = originationDO.getClass();
		Class<?> destClass = destinationDO.getClass();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(orgiClass);
			PropertyDescriptor[] propertyDescriptor = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptor) {

				if (property.getName().equalsIgnoreCase("class")) {
					continue;
				}
				Method orgiGetMethod = property.getReadMethod();
				if (orgiGetMethod == null) {
					continue;
				}
				String orgiGetMethodName = orgiGetMethod.getName();
				Method destGetMethod = null;
				String destSetMethodName = "";
				Method destSetMethod = null;
				if (property.getWriteMethod() != null) {
					destSetMethodName = property.getWriteMethod().getName();
				}
				try {
					destGetMethod = destClass.getMethod(orgiGetMethodName, null);
					destSetMethod = destClass.getMethod(destSetMethodName, destGetMethod.getReturnType());
				} catch (NoSuchMethodException nse) {
					continue;
				}

				Object orgiObject = orgiGetMethod.invoke(originationDO, null);

				if (orgiObject != null) {

					if (destGetMethod.getReturnType().equals(orgiGetMethod.getReturnType())) {
						if (String.class.equals(orgiGetMethod.getReturnType())) {
							destSetMethod.invoke(destinationDO, orgiObject.toString().trim());
						} else {
							destSetMethod.invoke(destinationDO, orgiObject);
						}
					} else if (Date.class.equals(destGetMethod.getReturnType())) {
						destSetMethod.invoke(destinationDO, orgiObject.toString());
					} else if (Date.class.equals(orgiGetMethod.getReturnType())) {
						destSetMethod.invoke(destinationDO, (Date) orgiObject);
					} else if (String.class.equals(destGetMethod.getReturnType())) {
						destSetMethod.invoke(destinationDO, orgiObject.toString());
					} else if ((BigDecimal.class.equals(destGetMethod.getReturnType())
							|| Integer.class.equals(destGetMethod.getReturnType()))
							&& !orgiObject.toString().trim().equals("")) {
						Constructor<?> constructor = destGetMethod.getReturnType().getConstructor(String.class);
						destSetMethod.invoke(destinationDO, constructor.newInstance(orgiObject.toString().trim()));
					} else if (BigDecimal[].class.equals(destGetMethod.getReturnType())
							&& String[].class.equals(orgiObject.getClass())) {
						BigDecimal destStrings[] = new BigDecimal[2000];
						for (int i = 0; i < ((String[]) orgiObject).length; i++) {
							String str = (String) ((String[]) orgiObject)[i];
							if (!str.trim().equals("")) {
								destStrings[i] = new BigDecimal(str);
							} else {
								destStrings[i] = null;
							}
						}
						Object[] obj = new Object[1];
						obj[0] = destStrings;
						destSetMethod.invoke(destinationDO, obj);
					}
				}
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

}
