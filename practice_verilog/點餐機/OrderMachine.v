module OrderMachine(
    input wire clk,
    input wire reset,
    input wire btn_burger,
    input wire btn_fries,
    input wire btn_cola,
    input wire btn_icecream,
    input wire btn_confirm,
    output reg led_burger,
    output reg led_fries,
    output reg led_cola,
    output reg led_icecream,
    output reg [7:0] total_price,
    output reg [3:0] qty_burger,
    output reg [3:0] qty_fries,
    output reg [3:0] qty_cola,
    output reg [3:0] qty_icecream
);

// 菜單價格
parameter PRICE_BURGER = 8'd70;
parameter PRICE_FRIES = 8'd35;
parameter PRICE_COLA = 8'd30;
parameter PRICE_ICECREAM = 8'd35;

// 狀態寄存器
reg [7:0] current_price;

// 重置和按鈕檢測
always @(posedge clk or posedge reset) begin
    if (reset) begin
        led_burger <= 0;
        led_fries <= 0;
        led_cola <= 0;
        led_icecream <= 0;
        qty_burger <= 0;
        qty_fries <= 0;
        qty_cola <= 0;
        qty_icecream <= 0;
        current_price <= 0;
        total_price <= 0;
    end else begin
        if (btn_burger) begin
            led_burger <= 1;
            qty_burger <= qty_burger + 1;
            current_price <= current_price + PRICE_BURGER;
        end
        if (btn_fries) begin
            led_fries <= 1;
            qty_fries <= qty_fries + 1;
            current_price <= current_price + PRICE_FRIES;
        end
        if (btn_cola) begin
            led_cola <= 1;
            qty_cola <= qty_cola + 1;
            current_price <= current_price + PRICE_COLA;
        end
        if (btn_icecream) begin
            led_icecream <= 1;
            qty_icecream <= qty_icecream + 1;
            current_price <= current_price + PRICE_ICECREAM;
        end
        if (btn_confirm) begin
            total_price <= current_price;
            current_price <= 0;
            led_burger <= 0;
            led_fries <= 0;
            led_cola <= 0;
            led_icecream <= 0;
            qty_burger <= 0;
            qty_fries <= 0;
            qty_cola <= 0;
            qty_icecream <= 0;
        end
    end
end

endmodule
/*
題目：點餐機(商品數量可以疊加，不考慮訊號彈跳問題)

參數設置： 定義每個菜單項目的價格。
狀態寄存器： 使用 current_price 來記錄當前選擇的菜單項目的總價格。
按鈕檢測和數量疊加： 根據按鈕信號的輸入，更新對應的LED和數量寄存器。
在確認按鈕被按下時，將當前價格保存到 total_price 並顯示出來，然後重置選擇和價格狀態以便重新點餐。
*/