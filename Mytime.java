import java.lang.*;

class Main
{
	int h, m, s;
	void gettime(int hr, int min, int sec)
	{
		h=hr;
		m=min;
		s=sec;	
	}
	void showtime()
	{
		System.out.println(h+" : "+m+" : "+s);	
	}
}

class Mytime
{
	public static void main(String args[])
	{
		Main obj=new Main();
		obj.gettime(7,13,29);
		System.out.println("Time Format in HH:MM:SS ");
		obj.showtime();	
	}
}
