module test(
    input CLK,
    input RESET,
    output reg [4:0] Q
);
    // 1 3 5 7 9 
    always @(posedge CLK or negedge RESET)
        if (!RESET)
            Q <= 5'h1;
        else
            if (Q == 5'h9)
                Q <= 5'h1;
            else
                Q <= Q + 5'h2;
endmodule