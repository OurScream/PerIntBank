package logincontrol;

public class LoginUser{
	private String zjid; 				//=userid; ���ݿ���zjid=֤��id
	private String khdlmm; 				//=userpwd; ���ݿ���khdlmm=�ͻ���¼����
	
	public String getzjid() {return zjid;}
	public void   setzjid(String zjid) {this.zjid = zjid;}
	public String getkhdlmm() {return khdlmm;}
	public void   setkhdlmm(String khdlmm) {this.khdlmm = khdlmm;}
}