#include "AT89X52.H"
sfr LED=0x80;
sfr SW=0x90;
void main(){
	unsigned char i=0;
	unsigned char sum=0;
	unsigned char n=0;
	while(1){
		do{
			n=SW;
	}while(n<=4);
	for(i=1;i<=n;i++){
		sum=sum+1;
	}
#if 0
	do{
		sum=sum+1;
		i++;
	}while(i<=n);
#endif
	LED=sum;
	}
}