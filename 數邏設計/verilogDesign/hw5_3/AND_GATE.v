module AND_GATE(
    input A,
    input B,
    input C,
    output reg F
);
    always @(A or B or C)
        if(&{A,B,C})//A,B,C 皆"1"時
            F=1'b1;
        else
            F=1'b0;
endmodule
