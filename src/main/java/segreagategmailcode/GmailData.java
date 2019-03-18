package segreagategmailcode;

public class GmailData {

	 private String myEmail;
	  private String myPassword;
	  private String toEmail;
	  private String message;
	  private String subject;
	  
	  public String getMyEmail() {
	        return myEmail;
	    }

	    public void setMyEmail(String myEmail) {
	        this.myEmail = myEmail;
	    }

	    public String getMyPassword() {
	        return myPassword;
	    }

	    public void setMyPassword(String myPassword) {
	        this.myPassword = myPassword;
	    }

		public String getToEmail() {
		        return toEmail;
		    }

		public void setToEmail(String toEmail) {
		        this.toEmail = toEmail;
		}
		
	
		
		public String getSubject()
		{
			return subject;
		}
	
		public void setSubject(String subject) {
	        this.subject = subject;
	}	
		
		public String getMessage()
		{
			return message;
		}
		
		public void setMessage(String message) {
	        this.message = message;
	}	
		 
	    @Override
	    public String toString() {
	        return "Person{" +
	                "MyEmail='" + myEmail + '\'' +
	                ", MyPassword='" + myPassword + '\'' +
	                ", ToEmail='" + toEmail + '\'' +
	                ", Subject='" + subject + '\'' +
	                ", Message='" + message + '\'' +
	                '}';
	    }
	
	
	
}
