module D_FF2(
    input CLK,
    input RESET,
    input D,
    output reg Q
);
    always @(negedge CLK,negedge RESET)
        if(!RESET)
            Q=0;
        else
            Q=D;
endmodule