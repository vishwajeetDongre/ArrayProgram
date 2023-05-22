import java.util.*;
public class reversetable {
	static int table=0,i=1;
	static void show(int no)
	{ 
		if(i<=10){
			table=i*no;
			i++;
			System.out.println(table);
			show(no);
		}
	}

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number");
		int no=S.nextInt();
		show(no);

	}

}
