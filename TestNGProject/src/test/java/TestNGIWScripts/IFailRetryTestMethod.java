package TestNGIWScripts;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class IFailRetryTestMethod implements ITestAnnotation{

public void transform(ITestAnnotation annotation) {
	annotation.setRetryAnalyzer(TestNGIWScripts.RetryClass.class);
 }

public long getTimeOut() {
	// TODO Auto-generated method stub
	return 0;
}

public void setTimeOut(long l) {
	// TODO Auto-generated method stub
	
}

public String[] getGroups() {
	// TODO Auto-generated method stub
	return null;
}

public void setGroups(String[] groups) {
	// TODO Auto-generated method stub
	
}

public String[] getDependsOnGroups() {
	// TODO Auto-generated method stub
	return null;
}

public void setDependsOnGroups(String[] groups) {
	// TODO Auto-generated method stub
	
}

public String[] getDependsOnMethods() {
	// TODO Auto-generated method stub
	return null;
}

public void setDependsOnMethods(String[] dependsOnMethods) {
	// TODO Auto-generated method stub
	
}

public String getDescription() {
	// TODO Auto-generated method stub
	return null;
}

public void setDescription(String description) {
	// TODO Auto-generated method stub
	
}

public String[] getParameters() {
	// TODO Auto-generated method stub
	return null;
}

public boolean getEnabled() {
	// TODO Auto-generated method stub
	return false;
}

public void setEnabled(boolean enabled) {
	// TODO Auto-generated method stub
	
}

public int getInvocationCount() {
	// TODO Auto-generated method stub
	return 0;
}

public void setInvocationCount(int l) {
	// TODO Auto-generated method stub
	
}

public int getThreadPoolSize() {
	// TODO Auto-generated method stub
	return 0;
}

public void setThreadPoolSize(int n) {
	// TODO Auto-generated method stub
	
}

public int getSuccessPercentage() {
	// TODO Auto-generated method stub
	return 0;
}

public void setSuccessPercentage(int s) {
	// TODO Auto-generated method stub
	
}

public boolean getAlwaysRun() {
	// TODO Auto-generated method stub
	return false;
}

public void setAlwaysRun(boolean f) {
	// TODO Auto-generated method stub
	
}

public Class<?>[] getExpectedExceptions() {
	// TODO Auto-generated method stub
	return null;
}

public void setExpectedExceptions(Class<?>[] e) {
	// TODO Auto-generated method stub
	
}

public String getExpectedExceptionsMessageRegExp() {
	// TODO Auto-generated method stub
	return null;
}

public void setExpectedExceptionsMessageRegExp(String e) {
	// TODO Auto-generated method stub
	
}

public String getSuiteName() {
	// TODO Auto-generated method stub
	return null;
}

public void setSuiteName(String s) {
	// TODO Auto-generated method stub
	
}

public String getTestName() {
	// TODO Auto-generated method stub
	return null;
}

public void setTestName(String s) {
	// TODO Auto-generated method stub
	
}

public boolean getSequential() {
	// TODO Auto-generated method stub
	return false;
}

public void setSequential(boolean f) {
	// TODO Auto-generated method stub
	
}

public boolean getSingleThreaded() {
	// TODO Auto-generated method stub
	return false;
}

public void setSingleThreaded(boolean f) {
	// TODO Auto-generated method stub
	
}

public String getDataProvider() {
	// TODO Auto-generated method stub
	return null;
}

public void setDataProvider(String v) {
	// TODO Auto-generated method stub
	
}

public Class<?> getDataProviderClass() {
	// TODO Auto-generated method stub
	return null;
}

public void setDataProviderClass(Class<?> v) {
	// TODO Auto-generated method stub
	
}

public IRetryAnalyzer getRetryAnalyzer() {
	// TODO Auto-generated method stub
	return null;
}

public void setRetryAnalyzer(Class<?> c) {
	// TODO Auto-generated method stub
	
}

public boolean skipFailedInvocations() {
	// TODO Auto-generated method stub
	return false;
}

public void setSkipFailedInvocations(boolean skip) {
	// TODO Auto-generated method stub
	
}

public long invocationTimeOut() {
	// TODO Auto-generated method stub
	return 0;
}

public void setInvocationTimeOut(long timeOut) {
	// TODO Auto-generated method stub
	
}

public boolean ignoreMissingDependencies() {
	// TODO Auto-generated method stub
	return false;
}

public void setIgnoreMissingDependencies(boolean ignore) {
	// TODO Auto-generated method stub
	
}

public int getPriority() {
	// TODO Auto-generated method stub
	return 0;
}

public void setPriority(int priority) {
	// TODO Auto-generated method stub
	
}
	
 
}