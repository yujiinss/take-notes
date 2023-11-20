package schedule;

import java.sql.Date;
import java.util.List;

public class Handler {

	ScheduleDAO dao = new ScheduleDAO ();
	
	public List<ScheduleDTO> selectAll()  {
		
		return dao.selectAll();
	}

	public String dbVersion() {
		return dao.dbVersion();
	}

	public Date getSysdate() {	
		return dao.getSysdate();
	}



}
