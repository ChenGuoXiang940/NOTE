module RELATIONAL(
	input [3:0]A,
	input [3:0]B,
	output EQV,
	output NOT_EQV,
	output CEQV,
	output CNOT_EQV
	);
	assign EQV=(A==B);
	assign NOT_EQV=(A!=B);
	assign CEQV=(A===B);
	assign CNOT_EQV=(A!==B);
endmodule