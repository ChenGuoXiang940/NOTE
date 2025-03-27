void main(){
	unsigned char i=250;
	char j=-120;
	unsigned int k=65530;
	unsigned long l=0x12345678;
	float m=1.02;
 loop:
  i=i+1;
  j=j+1;
  k=k+1;
  l=l+1;
  m=m+0.01;
 goto loop;
}