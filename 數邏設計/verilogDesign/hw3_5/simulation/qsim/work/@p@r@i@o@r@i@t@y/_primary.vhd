library verilog;
use verilog.vl_types.all;
entity PRIORITY is
    port(
        A               : in     vl_logic;
        B               : in     vl_logic;
        C               : in     vl_logic;
        X               : in     vl_logic;
        Y               : in     vl_logic;
        F               : out    vl_logic
    );
end PRIORITY;
