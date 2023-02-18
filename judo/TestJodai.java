public class TestJodai {

	public static void main(String[] args) {
		Jodai j1 = new Jodai(1, "j1", 100);
		Jodai j2 = new Jodai(2, "j2", 92);
		Jodai j3 = new Jodai(3, "j3", 58);
		Jodai j4 = new Jodai(4, "j4", 66);
		Jodai j5 = new Jodai(5, "j5", 97);
		Jodai j6 = new Jodai(6, "j6", 88);
		
		Jclub jc1 = new Jclub("club1");
		Jclub jc2 = new Jclub("club2");
		
		jc1.addWo(j1);
		jc1.addWo(j2);
		jc2.addWo(j3);
		jc2.addWo(j4);
		jc2.addWo(j5);
		jc2.addWo(j6);
			
		Battle b1 = new Battle(j2, j5, 2, new Date(12,12,2022));
		jc1.getWo(2).moreWin(1);
		Battle b2 = new Battle(j2, j4, 2, new Date(12,11,2022));
		jc1.getWo(2).moreWin(1);
		Battle b3 = new Battle(j2, j5, 2, new Date(12,10,2022));
		jc1.getWo(2).moreWin(1);
		Battle b4 = new Battle(j2, j3, 2, new Date(12,9,2022));
		jc1.getWo(2).moreWin(1);
		Battle b5 = new Battle(j1, j4, 4, new Date(12,8,2022));
		jc2.getWo(4).moreWin(1);
		Battle b6 = new Battle(j1, j5, 5, new Date(12,7,2022));
		jc2.getWo(5).moreWin(1);
		Battle b7 = new Battle(j1, j6, 1, new Date(12,6,2022));
		jc1.getWo(1).moreWin(1);
		
		BattleYear bYear1 = new BattleYear();
		bYear1.addBattle(b1);
		bYear1.addBattle(b2);
		bYear1.addBattle(b3);
		bYear1.addBattle(b4);
		bYear1.addBattle(b5);
		bYear1.addBattle(b6);
		bYear1.addBattle(b7);
		
		int jc1Count = 0, jc2Count = 0;
		Battle[] battles = bYear1.getBattles();
		for(int i = 0; i < battles.length; i++)
		{
			
			if(jc1.getWo(battles[i].getIdwin()) != null) 
				jc1Count++;
			if(jc2.getWo(battles[i].getIdwin()) != null) 
				jc2Count++;
		}
		
		if (jc1Count > jc2Count)
			System.out.println(jc1.getName() + " win in " + jc1Count + " battles");
		else
			System.out.println(jc2.getName() + " win in " + jc2Count + " battles");
		
		Jodai[] jodaisC1 = jc1.getWoArray(40,200);
		Jodai[] jodaisC2 = jc2.getWoArray(40,200);
		
		Jodai champ = jodaisC1[0];
		
		System.out.println("________________");
		for(int i = 1; i < jodaisC1.length; i++)
		{
			if(jodaisC1[i].getWin()[0] != 0)
				System.out.println(jodaisC1[i].getName() + " - " + jodaisC1[i].getWin()[0]);
			if(champ.getWin()[i] < jodaisC1[i].getWin()[0])
				champ = jodaisC1[i];
		}
		for(int i = 0; i < jodaisC2.length; i++)
		{
			if(jodaisC2[i].getWin()[0] != 0)
				System.out.println(jodaisC2[i].getName() + " - " + jodaisC2[i].getWin()[0]);
			if(champ.getWin()[0] < jodaisC2[i].getWin()[0])
				champ = jodaisC2[i];
		}
		
		System.out.println("________________");
		champ.setWoName("Champ-" + champ.getName());
		System.out.println(champ.getName() + " wins:");
		for(int i = 0; i < battles.length; i++)
		{
			if(battles[i].getIdwin() == champ.getId())
				System.out.println(battles[i].toString());
	
		}
		
		System.out.println("________________");
		Jodai[] jc1_80_100 = jc1.getWoArray(79, 101);
		Jodai[] jc2_80_100 = jc2.getWoArray(79, 101);
		System.out.println(jc1.getName() + " 80 to 100:");
		for(int i = 0; i < jc1_80_100.length; i++)
			System.out.println(jc1_80_100[i].toString());
		
		System.out.println(jc2.getName() + " 80 to 100:");
		for(int i = 0; i < jc2_80_100.length; i++)
			System.out.println(jc2_80_100[i].toString());	
	}
}
