package ssm.lxh.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Fly {
	
	Integer fid;//  ����ID  
	@NotNull(message="�������Ʋ���Ϊ��")
	String fname;// ��������
	@NotNull(message="�������в�����Ϊ��")
	@Pattern(regexp="[����]+",message="�������б���Ϊ����")
	String gcity;// ��ɳ��� 
	String tcity;// �������  
	String fdate;// ��������  
	String ftime;// ����ʱ�� 
	
	
	public Fly() {
		// TODO Auto-generated constructor stub
	}


	public Integer getFid() {
		return fid;
	}


	public void setFid(Integer fid) {
		this.fid = fid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getGcity() {
		return gcity;
	}


	public void setGcity(String gcity) {
		this.gcity = gcity;
	}


	public String getTcity() {
		return tcity;
	}


	public void setTcity(String tcity) {
		this.tcity = tcity;
	}


	public String getFdate() {
		return fdate;
	}


	public void setFdate(String fdate) {
		this.fdate = fdate;
	}


	public String getFtime() {
		return ftime;
	}


	public void setFtime(String ftime) {
		this.ftime = ftime;
	}


	@Override
	public String toString() {
		return "Fly [fid=" + fid + ", fname=" + fname + ", gcity=" + gcity + ", tcity=" + tcity + ", fdate=" + fdate
				+ ", ftime=" + ftime + "]";
	}


	public Fly(Integer fid, String fname, String gcity, String tcity, String fdate, String ftime) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.gcity = gcity;
		this.tcity = tcity;
		this.fdate = fdate;
		this.ftime = ftime;
	}
	
	
	

}
