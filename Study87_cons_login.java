package Study0428;

import java.util.Scanner;

public class Study87_cons_login 
{

	public static void main(String[] args)
	{
		Member member = new Member();
	}

}

class Member
{
	Scanner sc = new Scanner(System.in);
	
	String id="";
	String pw="";
	String name;
	String phone;
	
	String InputID;
	String InputPW;
	
	int nm;
	
	Member()
	{
		while(true)
		{
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			
			System.out.print("선택: ");
			nm = sc.nextInt();
			
			if(nm == 1)
			{
				System.out.println();
			}
			else if(nm == 2)
			{
				System.out.println();
				System.out.print("아이디: ");
				id = sc.next();
				System.out.print("비번: ");
				pw = sc.next();
				System.out.print("이름: ");
				name = sc.next();
				System.out.print("전화번호: ");
				phone = sc.next();
				
				System.out.println();
				System.out.println("1.로그인");
				System.out.println("2.회원가입");
				System.out.println("3.종료");
				
				System.out.print("선택: ");
				nm = sc.nextInt();
				System.out.println();
			}
			else if(nm == 3)
			{
				System.out.println("프로그램 종료.");
				break;	
			}
			
			System.out.print("아이디: ");
			InputID = sc.next();
			System.out.print("비번: ");
			InputPW = sc.next();
			
			if(id.equals("") && pw.equals(""))
			{
				System.out.println("회원정보가 없습니다.\n");
			}		
			else if(!InputID.equals(id) && !InputPW.equals(pw))
			{
				System.out.println("아이디,비밀번호가 틀렸습니다.\n");
			}		
			else if(!InputID.equals(id))
			{
				System.out.println("아이디가 틀렸습니다.\n");
			}		
			else if(!InputPW.equals(pw))
			{
				System.out.println("비밀번호가 틀렸습니다.\n");
			}
			
			else if(InputID.equals(id) && InputPW.equals(pw))
			{
				System.out.println(name+"/"+phone+"님이 로그인 되었습니다.");
				break;
			}
		}
	}
}
