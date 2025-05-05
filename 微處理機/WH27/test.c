#include "stdio.h"
#include "math.h"
float f(float x){
	float guess=x/2.0f;
	float esp=0.001f;
	float diff;
	do{
		float newg=0.5f*(guess+x/guess);
		diff=newg-guess;
		if(diff<0)diff=-diff;
		guess=newg;
	}while(diff>esp);
	return guess;
}
void main() {
    unsigned char TableA[] = {34, 65, 12, 34, 67, 89, 7, 6, 83, 89};
    unsigned char TableB[] = {30, 61, 13, 38, 65, 80, 10, 7, 82, 81};
		unsigned int i;
		float rmse;
    float sum = 0.0;
    for (i = 0; i < 10; i++) {
        float diff = (float)(TableA[i] - TableB[i]);
        sum += diff * diff;
    }
    rmse = f(sum/10.0f);
		printf("RMSE: %f\n", rmse);
}