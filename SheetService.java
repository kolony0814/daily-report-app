@Service
public class SheetService {

private static final String SPREADSHEET_ID = "スプレッドシートID";
private static final String RANGE = "日報!A:F";

public void save(DailyReport report) {

try {
Sheets sheetsService = SheetsServiceFactory.create(); // 認証済み想定

List<Object> row = Arrays.asList(
report.getDate().toString(),
report.getWorkContent(),
report.getProgress(),
report.getGrowth(),
report.getReflection(),
report.getSummary()
);

ValueRange body = new ValueRange()
.setValues(List.of(row));

sheetsService.spreadsheets().values()
.append(SPREADSHEET_ID, RANGE, body)
.setValueInputOption("RAW")
.execute();

} catch (Exception e) {
throw new RuntimeException("スプレッドシート保存失敗", e);
}
}
}
