module RELATIONAL(
	input [3:0]A,
	input [3:0]B,
	output LARGE,
	output SMALL,
	output LARGE_EQV,
	output SMALL_EQV);
	assign LARGE=(A>B);
	assign SMALL=(A<B);
	assign LARGE_EQV=(A>=B);
	assign SMALL_EQV=(A<=B);
endmodule