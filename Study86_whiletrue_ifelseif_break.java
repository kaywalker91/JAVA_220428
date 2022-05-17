package Study0428;

import java.util.Scanner;

public class Study86_whiletrue_ifelseif_break 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String ID = "admin";
		String PW = "1004";
		
		String InputID;
		String InputPW;
		
		int nm;
		
		while(true)
		{
			System.out.println("1.로그인");
			System.out.println("2.종료");
			
			System.out.print("선택: ");
			nm = sc.nextInt();
			
			if(nm == 1)
			{
				System.out.println();
			}
			else if(nm == 2)
			{
				System.out.println("프로그램 종료.");
				break;	
			}
			
			ID = "admin";
			PW = "1004";
			
			System.out.print("아이디: ");
			InputID = sc.next();
			System.out.print("비번: ");
			InputPW = sc.next();
			
			if(!InputID.equals(ID) && !InputPW.equals(PW))
			{
				System.out.println("아이디,비밀번호가 틀렸습니다.\n");
			}		
			else if(!InputID.equals(ID))
			{
				System.out.println("아이디가 틀렸습니다.\n");
			}		
			else if(!InputPW.equals(PW))
			{
				System.out.println("비밀번호가 틀렸습니다.\n");
			}
			
			else if(InputID.equals(ID) && InputPW.equals(PW))
			{
				System.out.println("관리자가 로그인 되었습니다.");
				break;
			}
		}
	}

}
