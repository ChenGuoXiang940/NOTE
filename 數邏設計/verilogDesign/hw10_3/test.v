module test(
    input clk,
    input rst,
    output reg [7:0] q
);
`define bcd
`ifdef bcd
    always @(posedge clk or posedge rst)
        begin
            if (rst) begin
                q <= 8'b00000000; // 重置十位與個位數
            end else if (q == 8'b10011001) begin // 當 q 等於 99 時歸零
                q <= 8'b00000000;
            end else if (q[3:0] == 4'b1001) begin // 個位數進位
                q[3:0] <= 4'b0000;
                if (q[7:4] == 4'b1001) begin // 十位數進位
                    q[7:4] <= 4'b0000;
                end else begin
                    q[7:4] <= q[7:4] + 1;
                end
            end else begin
                q[3:0] <= q[3:0] + 1; // 個位數加 1
            end
        end
`else
    `ifdef binary
    always @(posedge clk or posedge rst)
        begin
            if (rst) begin
                q <= 4'b0000;
            end else if (q == 4'b1111) begin
                q <= 4'b0000;
            end else begin
                q <= q + 1;
            end
        end
    `endif
`endif
endmodule