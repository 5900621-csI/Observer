
class NishinHyouji implements Observer {
	public void update(Subject s){
		print(((Suuchi)s).getValue());
	}

	public void print(int n){
		System.out.println(n + "を2進数で表示します");
		String str;
		int i = n;
		if(i >= 512){
			str = "1";
			i = i - 512;
		}else{
			str = "0";
		}
		if(i >= 256){
			str = str + "1";
			i = i -256;
		}else{
			str = str + "0";
		}
		if(i >= 128){
			str = str + "1";
			i = i - 128;
		}else{
			str = str + "0";
		}
		if(i >= 64){
			str = str + "1";
			i = i - 64;
		}else{
			str = str + "0";
		}
		if(i >= 32){
			str = str + "1";
			i = i -32;
		}else{
			str = str + "0";
		}
		if(i >= 16){
			str = str + "1";
			i = i - 16;
		}else{
			str = str + "0";
		}
		if(i >= 8){
			str = str + "1";
			i = i - 8;
		}else{
			str = str + "0";
		}
		if(i >= 4){
			str = str + "1";
			i = i - i;
		}else{
			str = str + "0";
		}
		if(i >= 2){
			str = str + "1";
			i = i - 2;
		}else{
			str = str + "0";
		}
		if(i == 1){
			str = str + "1";
			i = i - 1;
		}else{
			str = str + "0";
		}
	}
}
