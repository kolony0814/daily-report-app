public class DailyReport {

/** 日付 */
private LocalDate date;

/** 作業内容 */
private String workContent;

/** 進捗度 */
private int progress;

/** 週次：成長点 */
private String growth;

/** 週次：反省点 */
private String reflection;

/** 月次：総評 */
private String summary;

// --- getter / setter ---

public LocalDate getDate() {
return date;
}
public void setDate(LocalDate date) {
this.date = date;
}

public String getWorkContent() {
return workContent;
}
public void setWorkContent(String workContent) {
this.workContent = workContent;
}

public int getProgress() {
return progress;
}
public void setProgress(int progress) {
this.progress = progress;
}

public String getGrowth() {
return growth;
}
public void setGrowth(String growth) {
this.growth = growth;
}

public String getReflection() {
return reflection;
}
public void setReflection(String reflection) {
this.reflection = reflection;
}

public String getSummary() {
return summary;
}
public void setSummary(String summary) {
this.summary = summary;
}
}
