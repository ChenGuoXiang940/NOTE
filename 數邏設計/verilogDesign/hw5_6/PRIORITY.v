module PRIORITY(
    input A,
    input B,
    input C,
    input X,
    input Y,
    output reg F
);
    always @(A or B or C or X or Y)
        if(X==1'b1)
            F=A;
        else if(Y==1'b1)
            F=B;
        else
            F=C;
endmodule