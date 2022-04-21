public class Main
{
    public static String ConcatRemove(String x,String y,int op){
    int i = 0;
    String s = x.replaceAll("\\s", "");
    String t = y.replaceAll("\\s", "");
    int needed_ops = 0;
    while(i<s.length()&&i<t.length()&&s.charAt(i)==t.charAt(i)){
      i++;
    }
    if(i==0){
      needed_ops = s.length()+1+t.length();
    }
    else{
      i ++;
      needed_ops = (s.length()-i)+(t.length()-i);
    }
    if(needed_ops<= op){
      return "yes";
    }
    else{
      return "no";
    }
  }
	public static void main(String[] args) {
		String result = ConcatRemove("head", "heed", 4);
		System.out.println(result);
		String result2 = ConcatRemove("apple", "banana", 8);
		System.out.println(result2);
	}
}
