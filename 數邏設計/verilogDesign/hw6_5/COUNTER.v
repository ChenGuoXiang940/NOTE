module COUNTER(
    input CLK,
    input RESET,
    output reg [3:0] Q
);
    always @(posedge CLK or negedge RESET)
        if(!RESET)
            Q=4'h0;
        else
            begin
                Q=Q+1'b1;
                if(Q==4'hA)
                    Q=4'h0;
            end
endmodule