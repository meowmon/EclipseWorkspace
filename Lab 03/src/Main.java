class Hobbits{
	String name;
	public static void main (String[] args)
	{
		int z = 0;
		Hobbits [] h = new Hobbits[3];
		while(z<4) {
			z++;
			h[z] = new Hobbits();
			h[z].name="bil";
			if(z==1) {
				h[z].name = "cc";
				
			}
			if(z==2)
				h[z].name="cc2";
			System.out.print(h[z].name + "is a");
			System.out.println("con cac");
		}
	}
}