package JavaBasicsImplementations;

public class TypeCasting {
 public static void main(String[] args) {
	 //implicit casting
byte b = 10;
short s= b;
int i = s;
long l = i;
float f = l;
double d = f;
System.out.println(d);


//explicit casting

double dd = 20.0;
float ff = (float) dd;
long ll =  (long) ff;
int ii = (int) ll;
short ss = (short)ii;
byte bb = (byte)ss;
System.out.println(ii);

}
}
