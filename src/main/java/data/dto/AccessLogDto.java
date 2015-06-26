package data.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "application-log-2015.06.07", type = "application-log", shards = 1, replicas = 0, indexStoreType = "memory", refreshInterval = "-1")
public class AccessLogDto {

	@Id
	private String ID;
	private String uid;
	private Long tinterval;
	private String time;
	private String ptitle;
	private Long pid;
	private String mode;
	
	public AccessLogDto() {
		super();
	}

	@Version
	private Long version;

	public Long getTinterval() {
		return tinterval;
	}

	public void setTinterval(Long tinterval) {
		this.tinterval = tinterval;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPtitle() {
		return ptitle;
	}

	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

}
