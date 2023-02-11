package prac.ams;

/**
 * @author 김재훈 현실세계의 객체를 프로그램으로 표현하기 은행계좌 추상화 객체 추상화 객체지향 프로그래밍의 4대 특징: 1. 추상화
 *         2. 캡슐화 3. 상속 4. 다형성
 */
//클래스에 선언하는 접근제한자 : 생략, public
public class AccountPrac {
	// 깃허브 테스토다
	// 은행이름 상수
	public final static String BANK_NAME = "후니뱅크";

	// 객체의 속성(정보)들을 저장하기 위한 변수 = 필드
	// 인스턴스 변수들? Account는 클래스이지만 Account 클래스를 통하여 만들어진 인스턴스들이 쓰는 변수니까 인스턴스 변수?
	// 필드에 선언할 수 있는 접근 제한자: private, default(생량가능), protected, public
	
	private String accountNumber;
	private String accountOwner;
	private int password;
	private long restMoney;
	
	// 생성자 만들기
	// 1. 디폴트생성자
	public AccountPrac() {
//		this.accountNumber = null;
//		this.accountOwner = null;
//		this.password = 0;
//		this.restMoney = 0L;
	}
	
	public AccountPrac(String accountNumber, String accountOwner) {
		this(accountNumber, accountOwner, 0, 0L); // 밑에 매개변수 4개 짜리 생성자를 호출하고 있는 것.. 이라고 한다. 
	}
	
	public AccountPrac(String number, String owner, int passwd, long money) {
		this.accountNumber = number;
		this.accountOwner = owner;
		this.password = passwd;
		this.restMoney = money;
	}
	
	// getter, setter 정의
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public long getRestMoney() {
		return restMoney;
	}

	public void setRestMoney(long restMoney) {
		this.restMoney = restMoney;
	}
	
	// 인스턴스 객체의 행위(동작)을 정의하기 위한 인스턴스 메소드들
	// 입금 기능
	public long deposit(long money) {
		restMoney += money;
		return restMoney;
	}
	
	// 출금 기능
	public long withDrawMoney(long money) throws NotSufficientBalanceExceptionPrac {
		if(money <= 0) {
			throw new NotSufficientBalanceExceptionPrac("출금 금액은 음수일 수 없다.", 110);
		}
		if(money > restMoney) {
			throw new NotSufficientBalanceExceptionPrac("잔액이 부족합니다.", 100);
		}
		restMoney -= money;
		return restMoney;
	}
	
	// 모든 정보 출력기능
	// PolyExample2
	@Override
	public String toString() {
		return accountNumber + " " + accountOwner + " " + "****" + restMoney;
	}
	
	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		AccountPrac account = (AccountPrac) obj;
		String accNumber = account.getAccountNumber();
		if(accNumber.equals(getAccountNumber())) {
			String accOwner = account.getAccountOwner();
			if(accOwner.equals(getAccountOwner())) {
				return true;
			}
		}
		return false;
	}

	
	

}
