library verilog;
use verilog.vl_types.all;
entity HALF_ADDER is
    port(
        X               : in     vl_logic;
        Y               : in     vl_logic;
        S               : out    vl_logic;
        C               : out    vl_logic
    );
end HALF_ADDER;
