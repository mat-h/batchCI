package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DBPrinter {

	private static final String SQL = "select count(1) from jobs";
	final JdbcTemplate j;
	
	@Autowired
	public DBPrinter(JdbcTemplate j) {
		this.j=j;
	}
	
	public void print() {
//		int i= j.queryForObject(SQL, Integer.class);
		int i = j.query(SQL, rs -> {rs.next();return (Integer)rs.getInt(1);});
		System.out.println("jdbc returned " + i);
	}
}
