module COUNTER(
    input CLK,
    input RESET,
    output [2:0] Q
);
    reg [3:0] state_reg;
    always @(posedge CLK or negedge RESET)
        begin
            if (!RESET)
                state_reg <= {1'b0, 3'o1};
            else
                case (state_reg)
                    {1'b0,3'o1} : state_reg <= {1'b0, 3'o5};
                    {1'b0,3'o5} : state_reg <= {1'b0, 3'o3};
                    {1'b0,3'o3} : state_reg <= {1'b0, 3'o7};
                    {1'b0,3'o7} : state_reg <= {1'b0, 3'o2};
                    {1'b0,3'o2} : state_reg <= {1'b1, 3'o7};
                    {1'b1,3'o7} : state_reg <= {1'b0, 3'o4};
                    {1'b0,3'o4} : state_reg <= {1'b0, 3'o1};
                    default     : state_reg <= {1'b0, 3'o1};
                endcase
        end
    assign Q = state_reg[2:0];
endmodule
