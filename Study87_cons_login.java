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
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.����");
			
			System.out.print("����: ");
			nm = sc.nextInt();
			
			if(nm == 1)
			{
				System.out.println();
			}
			else if(nm == 2)
			{
				System.out.println();
				System.out.print("���̵�: ");
				id = sc.next();
				System.out.print("���: ");
				pw = sc.next();
				System.out.print("�̸�: ");
				name = sc.next();
				System.out.print("��ȭ��ȣ: ");
				phone = sc.next();
				
				System.out.println();
				System.out.println("1.�α���");
				System.out.println("2.ȸ������");
				System.out.println("3.����");
				
				System.out.print("����: ");
				nm = sc.nextInt();
				System.out.println();
			}
			else if(nm == 3)
			{
				System.out.println("���α׷� ����.");
				break;	
			}
			
			System.out.print("���̵�: ");
			InputID = sc.next();
			System.out.print("���: ");
			InputPW = sc.next();
			
			if(id.equals("") && pw.equals(""))
			{
				System.out.println("ȸ�������� �����ϴ�.\n");
			}		
			else if(!InputID.equals(id) && !InputPW.equals(pw))
			{
				System.out.println("���̵�,��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
			}		
			else if(!InputID.equals(id))
			{
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.\n");
			}		
			else if(!InputPW.equals(pw))
			{
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.\n");
			}
			
			else if(InputID.equals(id) && InputPW.equals(pw))
			{
				System.out.println(name+"/"+phone+"���� �α��� �Ǿ����ϴ�.");
				break;
			}
		}
	}
}
