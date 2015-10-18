package TestCases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager 
{
	static DateFormat dateFormat = new SimpleDateFormat("E.MMMM.yyyy_HH.mm.ss[a]");
	static Date date = new Date();
	static String reportPath = "M:\\ExtentReports\\SchoolOfDragonsLive_" +dateFormat.format(date) + ".html";
	
	
	
	public static ExtentReports Instance() 
	{
	
		
		
		ExtentReports report;
		
		System.out.println(reportPath);
		report = new ExtentReports(reportPath, false);
		report.config().documentTitle("Automation Report").reportName("Regression");
		return report;
	}
	
	
	// public static ExtentReports Instance()
	// {
	// ExtentReports extent;
	// String Path = "./ExtentReport.html";
	// System.out.println(Path);
	// extent = new ExtentReports(Path, false);
	// extent.config().documentTitle("Automation
	// Report").reportName("Regression");
	// return extent;
	// }
}