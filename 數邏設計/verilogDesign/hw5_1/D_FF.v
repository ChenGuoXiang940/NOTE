module D_FF(
	input CLK,
	input D,
	output reg Q);
	always @(posedge CLK)
		Q=D;
endmodule