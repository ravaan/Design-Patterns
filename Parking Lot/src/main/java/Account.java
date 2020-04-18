public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountStatus getStatus() {
		return this.status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

  
    public boolean resetPassword();
  }