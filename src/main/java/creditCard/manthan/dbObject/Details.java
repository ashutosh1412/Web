package creditCard.manthan.dbObject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details {

	@Id
	private int ID;
	private String Name;
	private String LIMIT_BAL;
	private String SEX;
	private String EDUCATION;
	private String MARRIAGE;
	private String AGE;
	private String PAY_0;
	private String PAY_2;
	private String PAY_3;
	private String PAY_4;
	private String PAY_5;
	private String PAY_6;
	private String BILL_AMT1;
	private String BILL_AMT2;
	private String BILL_AMT3;
	private String BILL_AMT4;
	private String BILL_AMT5;
	private String BILL_AMT6;
	private String PAY_AMT1;
	private String PAY_AMT2;
	private String PAY_AMT3;
	private String PAY_AMT4;
	private String PAY_AMT5;
	private String PAY_AMT6;
	private String  default_Payment_Next_Month;
	
	public Details(int iD, String name, String lIMIT_BAL, String sEX, String eDUCATION, String mARRIAGE, String aGE,
			String pAY_0, String pAY_2, String pAY_3, String pAY_4, String pAY_5, String pAY_6, String bILL_AMT1,
			String bILL_AMT2, String bILL_AMT3, String bILL_AMT4, String bILL_AMT5, String bILL_AMT6, String pAY_AMT1,
			String pAY_AMT2, String pAY_AMT3, String pAY_AMT4, String pAY_AMT5, String pAY_AMT6,
			String default_Payment_Next_Month) {
		super();
		ID = iD;
		Name = name;
		LIMIT_BAL = lIMIT_BAL;
		SEX = sEX;
		EDUCATION = eDUCATION;
		MARRIAGE = mARRIAGE;
		AGE = aGE;
		PAY_0 = pAY_0;
		PAY_2 = pAY_2;
		PAY_3 = pAY_3;
		PAY_4 = pAY_4;
		PAY_5 = pAY_5;
		PAY_6 = pAY_6;
		BILL_AMT1 = bILL_AMT1;
		BILL_AMT2 = bILL_AMT2;
		BILL_AMT3 = bILL_AMT3;
		BILL_AMT4 = bILL_AMT4;
		BILL_AMT5 = bILL_AMT5;
		BILL_AMT6 = bILL_AMT6;
		PAY_AMT1 = pAY_AMT1;
		PAY_AMT2 = pAY_AMT2;
		PAY_AMT3 = pAY_AMT3;
		PAY_AMT4 = pAY_AMT4;
		PAY_AMT5 = pAY_AMT5;
		PAY_AMT6 = pAY_AMT6;
		this.setDefault_Payment_Next_Month(default_Payment_Next_Month);
	}
	public Details(String []args) {
		super();
		ID = Integer.parseInt(args[0]);
		Name = args[1];
		LIMIT_BAL = args[2];
		SEX = args[3];
		EDUCATION = args[4];
		MARRIAGE = args[5];
		AGE = args[6];
		PAY_0 = args[7];
		PAY_2 = args[8];
		PAY_3 = args[9];
		PAY_4 = args[10];
		PAY_5 = args[11];
		PAY_6 = args[12];
		BILL_AMT1 = args[13];
		BILL_AMT2 = args[14];
		BILL_AMT3 = args[15];
		BILL_AMT4 = args[16];
		BILL_AMT5 = args[17];
		BILL_AMT6 = args[18];
		PAY_AMT1 = args[19];
		PAY_AMT2 = args[20];
		PAY_AMT3 = args[21];
		PAY_AMT4 = args[22];
		PAY_AMT5 = args[23];
		PAY_AMT6 = args[24];
		this.setDefault_Payment_Next_Month(args[25]);
	}
	public Details() {
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLIMIT_BAL() {
		return LIMIT_BAL;
	}
	public void setLIMIT_BAL(String lIMIT_BAL) {
		LIMIT_BAL = lIMIT_BAL;
	}
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sEX) {
		SEX = sEX;
	}
	public String getEDUCATION() {
		return EDUCATION;
	}
	public void setEDUCATION(String eDUCATION) {
		EDUCATION = eDUCATION;
	}
	public String getMARRIAGE() {
		return MARRIAGE;
	}
	public void setMARRIAGE(String mARRIAGE) {
		MARRIAGE = mARRIAGE;
	}
	public String getAGE() {
		return AGE;
	}
	public void setAGE(String aGE) {
		AGE = aGE;
	}
	public String getPAY_0() {
		return PAY_0;
	}
	public void setPAY_0(String pAY_0) {
		PAY_0 = pAY_0;
	}
	public String getPAY_2() {
		return PAY_2;
	}
	public void setPAY_2(String pAY_2) {
		PAY_2 = pAY_2;
	}
	public String getPAY_3() {
		return PAY_3;
	}
	public void setPAY_3(String pAY_3) {
		PAY_3 = pAY_3;
	}
	public String getPAY_4() {
		return PAY_4;
	}
	public void setPAY_4(String pAY_4) {
		PAY_4 = pAY_4;
	}
	public String getPAY_5() {
		return PAY_5;
	}
	public void setPAY_5(String pAY_5) {
		PAY_5 = pAY_5;
	}
	public String getPAY_6() {
		return PAY_6;
	}
	public void setPAY_6(String pAY_6) {
		PAY_6 = pAY_6;
	}
	public String getBILL_AMT1() {
		return BILL_AMT1;
	}
	public void setBILL_AMT1(String bILL_AMT1) {
		BILL_AMT1 = bILL_AMT1;
	}
	public String getBILL_AMT2() {
		return BILL_AMT2;
	}
	public void setBILL_AMT2(String bILL_AMT2) {
		BILL_AMT2 = bILL_AMT2;
	}
	public String getBILL_AMT3() {
		return BILL_AMT3;
	}
	public void setBILL_AMT3(String bILL_AMT3) {
		BILL_AMT3 = bILL_AMT3;
	}
	public String getBILL_AMT4() {
		return BILL_AMT4;
	}
	public void setBILL_AMT4(String bILL_AMT4) {
		BILL_AMT4 = bILL_AMT4;
	}
	public String getBILL_AMT5() {
		return BILL_AMT5;
	}
	public void setBILL_AMT5(String bILL_AMT5) {
		BILL_AMT5 = bILL_AMT5;
	}
	public String getBILL_AMT6() {
		return BILL_AMT6;
	}
	public void setBILL_AMT6(String bILL_AMT6) {
		BILL_AMT6 = bILL_AMT6;
	}
	public String getPAY_AMT1() {
		return PAY_AMT1;
	}
	public void setPAY_AMT1(String pAY_AMT1) {
		PAY_AMT1 = pAY_AMT1;
	}
	public String getPAY_AMT2() {
		return PAY_AMT2;
	}
	public void setPAY_AMT2(String pAY_AMT2) {
		PAY_AMT2 = pAY_AMT2;
	}
	public String getPAY_AMT3() {
		return PAY_AMT3;
	}
	public void setPAY_AMT3(String pAY_AMT3) {
		PAY_AMT3 = pAY_AMT3;
	}
	public String getPAY_AMT4() {
		return PAY_AMT4;
	}
	public void setPAY_AMT4(String pAY_AMT4) {
		PAY_AMT4 = pAY_AMT4;
	}
	public String getPAY_AMT5() {
		return PAY_AMT5;
	}
	public void setPAY_AMT5(String pAY_AMT5) {
		PAY_AMT5 = pAY_AMT5;
	}
	public String getPAY_AMT6() {
		return PAY_AMT6;
	}
	public void setPAY_AMT6(String pAY_AMT6) {
		PAY_AMT6 = pAY_AMT6;
	}
	public String getDefault_Payment_Next_Month() {
		return default_Payment_Next_Month;
	}
	public void setDefault_Payment_Next_Month(String default_Payment_Next_Month) {
		this.default_Payment_Next_Month = default_Payment_Next_Month;
	}
}
