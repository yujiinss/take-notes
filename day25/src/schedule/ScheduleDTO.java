package schedule;

import java.util.Date;

public class ScheduleDTO {
//	create table schedule(
//			title  varchar2(100)  not null,
//			start_date  date       not null,
//			end_date    date        not null
//			);
	
private String title;
private Date start_date;
private Date end_date;

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Date getStart_date() {
	return start_date;
}
public void setStart_date(Date start_date) {
	this.start_date = start_date;
}
public Date getEnd_date() {
	return end_date;
}
public void setEnd_date(Date end_date) {
	this.end_date = end_date;

}}
