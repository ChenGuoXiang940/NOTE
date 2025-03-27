extern void func(int*);
void main(){
	int i=0;
	loop:
		i=i+1;
		func(&i);
	goto loop;
}