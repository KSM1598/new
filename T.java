class T{
public static void main(String args[]){
int a=1,b=0,s=0,c=2,t=0,cal=0;
for(int i=1;a<=400;i++)
{
cal=0;
t=a;
while(t!=0)
{
b=a%10;
t=t/10;
if(b==4)
{
cal++;
}
}
if(cal==0)
{
s=s+a;
}
a+=(c*c);
c++;
}
System.out.print(s);
}
}