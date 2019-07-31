


public class UserMsgResInfo implements SchemaNode{

	private static final long serialVersionUID = 1L;

	public void validate() throws Exception {
	}
	//交叉销售员工号
	private String USERCODE = "";
	//交叉销售员名称
	private String USERNAME = "";

	private String USERTYPE = "";

	private String USERSORT = "";

	private String COMCODE = "";

	private String HOMEPHONE = "";

	private String OFFICEPHONE = "";
	
	private String GROUPUSERCODE = "";

	private String FAXNUMBER = "";

	private String MOBILE = "";

	private String POSTADDRESS = "";

	private String ADDRESSCNAME = "";

	private String ADDRESSENAME = "";

	private String IDENTIFYNUMBER = "";

	private String CREDITLEVEL = "";

	private String SEX = "";

	private String BIRTHDATE = "";

	private String AGE = "";

	private String HEALTH = "";

	private String OCCUPATIONCODE = "";

	private String EDUCATIONCODE = "";

	private String UNIT = "";

	private String UNITADDRESS = "";

	private String CUSTOMERFLAG = "";

	private String BANK = "";

	private String ACCOUNT = "";

	private String TERMINALCODE = "";

	private String IP = "";
	//需求 1404515: 201712860-001 重庆分公司关于车险承保系统实现登录用户绑定IP地址的需求
	private String TRUEORFLASE="";//前台处理数据成功还是失败标志
	private String MACFlag="";//判断是走IP还是走MAC
	private String MACTRUE="";//实际的IP或者MAC地址
	/*PICC2014040801 关于新车险理赔系统用户代码与ip地址绑定使用的管控申请
	 * 新增MAC字段
	 * MODIFY BEGIN SUNYAKUAN,ADD,2014-5-21
	 */
	private String MAC ;
	private String MARKCODE = "";

	private String SOURCE = "";

	private String SEAL = "";

	private String ORGANIZATIONCODE = "";

	private String REGISTRATIONAGENCY = "";

	private String REGISTRATIONNUMBER = "";

	private String LOANCARDCODE = "";

	private String NATIONALTAXREGISTNO = "";

	private String OPENBANK = "";

	private String EMPNUMBER = "";

	private String REGISTRATIONDATE = "";

	private String REGISTEREDCAPITAL = "";

	private String LICENSEEXPIRINGDATE = "";

	private String CAPITAL = "";

	private String REGISTRATIONTYPE = "";

	private String BUSINESSSCOPE = "";

	private String MAINOPERATION = "";

	private String INDUSTRYCODE = "";

	private String INDUSTRYNAME = "";

	private String REGISTEREDADDRESS = "";

	private String AREACODE = "";

	private String AREANAME = "";

	private String MAILINGADDRESS = "";

	private String POSTCODE = "";

	private String CONTACTPERSON = "";

	private String CONTACTTELEPHONE = "";

	private String FAX = "";

	private String EMAIL = "";

	private String WEBSITE = "";
	
	//证件类型代码
	private String IDTYP_COD = "";

	//证件号码
	private String PAPERWORKID = "";
	
	//归属机构代码
	private String MAN_ORG_COD = "";
	
	//归属机构名称
	private String MAN_ORG_NAM = "";
	
	private String COMP_COD = "";
	
	private String COMP_NAM = "";
	
	//出单用户类型(00：内部员工 01：销售员工 02：外部员工)
	private String PUSERTYPE = "";
	
	//出单机构
	private String PCOMCODE = "";
	
	//岗位信息
	private String PGRADENAME = "";
	
	//网点属性
	private String NETWORKPROPERTIES = "";
	
	private String FLAG;
	
	//绑定渠道类型
	private String AGENTTYPECODE; 

	public String getFLAG() {
		return FLAG;
	}

	public void setFLAG(String fLAG) {
		FLAG = fLAG;
	}

	public String getUSERCODE() {
		return USERCODE;
	}

	public void setUSERCODE(String USERCODE) {
		this.USERCODE = USERCODE;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String USERNAME) {
		this.USERNAME = USERNAME;
	}

	public String getUSERTYPE() {
		return USERTYPE;
	}

	public void setUSERTYPE(String USERTYPE) {
		this.USERTYPE = USERTYPE;
	}

	public String getUSERSORT() {
		return USERSORT;
	}

	public void setUSERSORT(String USERSORT) {
		this.USERSORT = USERSORT;
	}

	public String getCOMCODE() {
		return COMCODE;
	}

	public void setCOMCODE(String COMCODE) {
		this.COMCODE = COMCODE;
	}

	public String getHOMEPHONE() {
		return HOMEPHONE;
	}

	public void setHOMEPHONE(String HOMEPHONE) {
		this.HOMEPHONE = HOMEPHONE;
	}

	public String getOFFICEPHONE() {
		return OFFICEPHONE;
	}

	public void setOFFICEPHONE(String OFFICEPHONE) {
		this.OFFICEPHONE = OFFICEPHONE;
	}

	public String getFAXNUMBER() {
		return FAXNUMBER;
	}

	public void setFAXNUMBER(String FAXNUMBER) {
		this.FAXNUMBER = FAXNUMBER;
	}

	public String getMOBILE() {
		return MOBILE;
	}

	public void setMOBILE(String MOBILE) {
		this.MOBILE = MOBILE;
	}

	public String getPOSTADDRESS() {
		return POSTADDRESS;
	}

	public void setPOSTADDRESS(String POSTADDRESS) {
		this.POSTADDRESS = POSTADDRESS;
	}

	public String getADDRESSCNAME() {
		return ADDRESSCNAME;
	}

	public void setADDRESSCNAME(String ADDRESSCNAME) {
		this.ADDRESSCNAME = ADDRESSCNAME;
	}

	public String getADDRESSENAME() {
		return ADDRESSENAME;
	}

	public void setADDRESSENAME(String ADDRESSENAME) {
		this.ADDRESSENAME = ADDRESSENAME;
	}

	public String getIDENTIFYNUMBER() {
		return IDENTIFYNUMBER;
	}

	public void setIDENTIFYNUMBER(String IDENTIFYNUMBER) {
		this.IDENTIFYNUMBER = IDENTIFYNUMBER;
	}

	public String getCREDITLEVEL() {
		return CREDITLEVEL;
	}

	public void setCREDITLEVEL(String CREDITLEVEL) {
		this.CREDITLEVEL = CREDITLEVEL;
	}

	public String getSEX() {
		return SEX;
	}

	public void setSEX(String SEX) {
		this.SEX = SEX;
	}

	public String getBIRTHDATE() {
		return BIRTHDATE;
	}

	public void setBIRTHDATE(String BIRTHDATE) {
		this.BIRTHDATE = BIRTHDATE;
	}

	public String getAGE() {
		return AGE;
	}

	public void setAGE(String AGE) {
		this.AGE = AGE;
	}

	public String getHEALTH() {
		return HEALTH;
	}

	public void setHEALTH(String HEALTH) {
		this.HEALTH = HEALTH;
	}

	public String getOCCUPATIONCODE() {
		return OCCUPATIONCODE;
	}

	public void setOCCUPATIONCODE(String OCCUPATIONCODE) {
		this.OCCUPATIONCODE = OCCUPATIONCODE;
	}

	public String getEDUCATIONCODE() {
		return EDUCATIONCODE;
	}

	public void setEDUCATIONCODE(String EDUCATIONCODE) {
		this.EDUCATIONCODE = EDUCATIONCODE;
	}

	public String getUNIT() {
		return UNIT;
	}

	public void setUNIT(String UNIT) {
		this.UNIT = UNIT;
	}

	public String getUNITADDRESS() {
		return UNITADDRESS;
	}

	public void setUNITADDRESS(String UNITADDRESS) {
		this.UNITADDRESS = UNITADDRESS;
	}

	public String getCUSTOMERFLAG() {
		return CUSTOMERFLAG;
	}

	public void setCUSTOMERFLAG(String CUSTOMERFLAG) {
		this.CUSTOMERFLAG = CUSTOMERFLAG;
	}

	public String getBANK() {
		return BANK;
	}

	public void setBANK(String BANK) {
		this.BANK = BANK;
	}

	public String getACCOUNT() {
		return ACCOUNT;
	}

	public void setACCOUNT(String ACCOUNT) {
		this.ACCOUNT = ACCOUNT;
	}

	public String getTERMINALCODE() {
		return TERMINALCODE;
	}

	public void setTERMINALCODE(String TERMINALCODE) {
		this.TERMINALCODE = TERMINALCODE;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String IP) {
		this.IP = IP;
	}

	public String getMARKCODE() {
		return MARKCODE;
	}

	public void setMARKCODE(String MARKCODE) {
		this.MARKCODE = MARKCODE;
	}

	public String getSOURCE() {
		return SOURCE;
	}

	public void setSOURCE(String SOURCE) {
		this.SOURCE = SOURCE;
	}

	public String getSEAL() {
		return SEAL;
	}

	public void setSEAL(String SEAL) {
		this.SEAL = SEAL;
	}

	public String getORGANIZATIONCODE() {
		return ORGANIZATIONCODE;
	}

	public void setORGANIZATIONCODE(String ORGANIZATIONCODE) {
		this.ORGANIZATIONCODE = ORGANIZATIONCODE;
	}

	public String getREGISTRATIONAGENCY() {
		return REGISTRATIONAGENCY;
	}

	public void setREGISTRATIONAGENCY(String REGISTRATIONAGENCY) {
		this.REGISTRATIONAGENCY = REGISTRATIONAGENCY;
	}

	public String getREGISTRATIONNUMBER() {
		return REGISTRATIONNUMBER;
	}

	public void setREGISTRATIONNUMBER(String REGISTRATIONNUMBER) {
		this.REGISTRATIONNUMBER = REGISTRATIONNUMBER;
	}

	public String getLOANCARDCODE() {
		return LOANCARDCODE;
	}

	public void setLOANCARDCODE(String LOANCARDCODE) {
		this.LOANCARDCODE = LOANCARDCODE;
	}

	public String getNATIONALTAXREGISTNO() {
		return NATIONALTAXREGISTNO;
	}

	public void setNATIONALTAXREGISTNO(String NATIONALTAXREGISTNO) {
		this.NATIONALTAXREGISTNO = NATIONALTAXREGISTNO;
	}

	public String getOPENBANK() {
		return OPENBANK;
	}

	public void setOPENBANK(String OPENBANK) {
		this.OPENBANK = OPENBANK;
	}

	public String getEMPNUMBER() {
		return EMPNUMBER;
	}

	public void setEMPNUMBER(String EMPNUMBER) {
		this.EMPNUMBER = EMPNUMBER;
	}

	public String getREGISTRATIONDATE() {
		return REGISTRATIONDATE;
	}

	public void setREGISTRATIONDATE(String REGISTRATIONDATE) {
		this.REGISTRATIONDATE = REGISTRATIONDATE;
	}

	public String getREGISTEREDCAPITAL() {
		return REGISTEREDCAPITAL;
	}

	public void setREGISTEREDCAPITAL(String REGISTEREDCAPITAL) {
		this.REGISTEREDCAPITAL = REGISTEREDCAPITAL;
	}

	public String getLICENSEEXPIRINGDATE() {
		return LICENSEEXPIRINGDATE;
	}

	public void setLICENSEEXPIRINGDATE(String LICENSEEXPIRINGDATE) {
		this.LICENSEEXPIRINGDATE = LICENSEEXPIRINGDATE;
	}

	public String getCAPITAL() {
		return CAPITAL;
	}

	public void setCAPITAL(String CAPITAL) {
		this.CAPITAL = CAPITAL;
	}

	public String getREGISTRATIONTYPE() {
		return REGISTRATIONTYPE;
	}

	public void setREGISTRATIONTYPE(String REGISTRATIONTYPE) {
		this.REGISTRATIONTYPE = REGISTRATIONTYPE;
	}

	public String getBUSINESSSCOPE() {
		return BUSINESSSCOPE;
	}

	public void setBUSINESSSCOPE(String BUSINESSSCOPE) {
		this.BUSINESSSCOPE = BUSINESSSCOPE;
	}

	public String getMAINOPERATION() {
		return MAINOPERATION;
	}

	public void setMAINOPERATION(String MAINOPERATION) {
		this.MAINOPERATION = MAINOPERATION;
	}

	public String getINDUSTRYCODE() {
		return INDUSTRYCODE;
	}

	public void setINDUSTRYCODE(String INDUSTRYCODE) {
		this.INDUSTRYCODE = INDUSTRYCODE;
	}

	public String getINDUSTRYNAME() {
		return INDUSTRYNAME;
	}

	public void setINDUSTRYNAME(String INDUSTRYNAME) {
		this.INDUSTRYNAME = INDUSTRYNAME;
	}

	public String getREGISTEREDADDRESS() {
		return REGISTEREDADDRESS;
	}

	public void setREGISTEREDADDRESS(String REGISTEREDADDRESS) {
		this.REGISTEREDADDRESS = REGISTEREDADDRESS;
	}

	public String getAREACODE() {
		return AREACODE;
	}

	public void setAREACODE(String AREACODE) {
		this.AREACODE = AREACODE;
	}

	public String getAREANAME() {
		return AREANAME;
	}

	public void setAREANAME(String AREANAME) {
		this.AREANAME = AREANAME;
	}

	public String getMAILINGADDRESS() {
		return MAILINGADDRESS;
	}

	public void setMAILINGADDRESS(String MAILINGADDRESS) {
		this.MAILINGADDRESS = MAILINGADDRESS;
	}

	public String getPOSTCODE() {
		return POSTCODE;
	}

	public void setPOSTCODE(String POSTCODE) {
		this.POSTCODE = POSTCODE;
	}

	public String getCONTACTPERSON() {
		return CONTACTPERSON;
	}

	public void setCONTACTPERSON(String CONTACTPERSON) {
		this.CONTACTPERSON = CONTACTPERSON;
	}

	public String getCONTACTTELEPHONE() {
		return CONTACTTELEPHONE;
	}

	public void setCONTACTTELEPHONE(String CONTACTTELEPHONE) {
		this.CONTACTTELEPHONE = CONTACTTELEPHONE;
	}

	public String getFAX() {
		return FAX;
	}

	public void setFAX(String FAX) {
		this.FAX = FAX;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	public String getWEBSITE() {
		return WEBSITE;
	}

	public void setWEBSITE(String WEBSITE) {
		this.WEBSITE = WEBSITE;
	}


	public String getIDTYP_COD() {
		return IDTYP_COD;
	}

	public void setIDTYP_COD(String idtyp_cod) {
		IDTYP_COD = idtyp_cod;
	}



	public String getPAPERWORKID() {
		return PAPERWORKID;
	}

	public void setPAPERWORKID(String paperworkid) {
		PAPERWORKID = paperworkid;
	}

	public String getMAN_ORG_COD() {
		return MAN_ORG_COD;
	}

	public void setMAN_ORG_COD(String man_org_cod) {
		MAN_ORG_COD = man_org_cod;
	}

	public String getMAN_ORG_NAM() {
		return MAN_ORG_NAM;
	}

	public void setMAN_ORG_NAM(String man_org_nam) {
		MAN_ORG_NAM = man_org_nam;
	}

	public String getCOMP_COD() {
		return COMP_COD;
	}

	public void setCOMP_COD(String comp_cod) {
		COMP_COD = comp_cod;
	}

	public String getCOMP_NAM() {
		return COMP_NAM;
	}

	public void setCOMP_NAM(String comp_nam) {
		COMP_NAM = comp_nam;
	}

	public String getGROUPUSERCODE() {
		return GROUPUSERCODE;
	}

	public void setGROUPUSERCODE(String gROUPUSERCODE) {
		GROUPUSERCODE = gROUPUSERCODE;
	}	
	
	public String getPUSERTYPE() {
		return PUSERTYPE;
	}

	public void setPUSERTYPE(String pusertype) {
		PUSERTYPE = pusertype;
	}

	public String getPCOMCODE() {
		return PCOMCODE;
	}

	public void setPCOMCODE(String pcomcode) {
		PCOMCODE = pcomcode;
	}

	public String getPGRADENAME() {
		return PGRADENAME;
	}

	public void setPGRADENAME(String pgradename) {
		PGRADENAME = pgradename;
	}

	public String getNETWORKPROPERTIES() {
		return NETWORKPROPERTIES;
	}

	public void setNETWORKPROPERTIES(String networkproperties) {
		NETWORKPROPERTIES = networkproperties;
	}

	public String getAGENTTYPECODE() {
		return AGENTTYPECODE;
	}

	public void setAGENTTYPECODE(String aGENTTYPECODE) {
		AGENTTYPECODE = aGENTTYPECODE;
	}

	public String getTRUEORFLASE() {
		return TRUEORFLASE;
	}

	public void setTRUEORFLASE(String tRUEORFLASE) {
		TRUEORFLASE = tRUEORFLASE;
	}

	public String getMACFlag() {
		return MACFlag;
	}

	public void setMACFlag(String mACFlag) {
		MACFlag = mACFlag;
	}

	public String getMACTRUE() {
		return MACTRUE;
	}

	public void setMACTRUE(String mACTRUE) {
		MACTRUE = mACTRUE;
	}

	public String getMAC() {
		return MAC;
	}

	public void setMAC(String mAC) {
		MAC = mAC;
	}

}
