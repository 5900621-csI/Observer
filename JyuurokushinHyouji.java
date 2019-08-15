
class JyuurokushinHyouji implements Observer{
	public void update(Subject s){
		print(((Suuchi)s).getValue());
	}

	public void print(int n){
		System.out.println(n + "を16進数で表示します");
		int i = n;
		int x;
		String str;
		x = i % 16;
		str = String.valueOf(x);
		while(true){
			x = i % 16;
			i = i / 16;
			if(x != 0){
				if(x < 10){
					str = x + str;
				}else if(x == 10){
					str = "A" + str;
				}else if(x == 11){
					str = "B" + str;
				}else if(x == 12){
					str = "C" + str;
				}else if(x == 13){
					str = "D" + str;
				}else if(x == 14){
					str = "E" + str;
				}else if(x == 15){
					str = "F" + str;
				}
			}
			if(i == 0){
				break;
			}
		}
	}
}
