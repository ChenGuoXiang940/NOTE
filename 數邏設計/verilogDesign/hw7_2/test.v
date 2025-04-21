module test(
    input CLK,
    input RESET,
    output reg [4:0] Q
);
    // 0 -> 1 -> … -> 99 -> 0
    // 2^7=128 99=7'h63
    always @(posedge CLK or negedge RESET)
        if (!RESET)
            Q <= 7'h0;
        else
            if (Q == 7'h63)
                Q <= 7'h0;
            else
                Q <= Q + 7'h1;
endmodule