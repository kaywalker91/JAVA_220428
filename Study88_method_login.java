package Study0428;

import java.util.Scanner;

public class Study88_method_login 
{

	public static void main(String[] args) 
	{
		Member1 member1 = new Member1();
		member1.logincheck();

	}

}

class Member1
{
	Scanner sc = new Scanner(System.in);
	
	String ID = "admin";
	String PW = "1004";
	
	String InputID;
	String InputPW;
	
	int nm;
	
	void logincheck()
	{
		while(true)
		{
			System.out.println("1.�α���");
			System.out.println("2.����");
			
			System.out.print("����: ");
			nm = sc.nextInt();
			
			if(nm == 1)
			{
				System.out.println();
			}
			else if(nm == 2)
			{
				System.out.println("���α׷� ����.");
				break;	
			}
			
			ID = "admin";
			PW = "1004";
			
			System.out.print("���̵�: ");
			InputID = sc.next();
			System.out.print("���: ");
			InputPW = sc.next();
			
			if(!InputID.equals(ID) && !InputPW.equals(PW))
			{
				System.out.println("���̵�,��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
			}		
			else if(!InputID.equals(ID))
			{
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.\n");
			}		
			else if(!InputPW.equals(PW))
			{
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
			}
			
			else if(InputID.equals(ID) && InputPW.equals(PW))
			{
				System.out.println("�����ڰ� �α��� �Ǿ����ϴ�.");
				break;
			}
		}
	}
}

