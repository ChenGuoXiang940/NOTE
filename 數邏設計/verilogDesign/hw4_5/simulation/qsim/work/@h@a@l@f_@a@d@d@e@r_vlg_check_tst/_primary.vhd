library verilog;
use verilog.vl_types.all;
entity HALF_ADDER_vlg_check_tst is
    port(
        C               : in     vl_logic;
        S               : in     vl_logic;
        sampler_rx      : in     vl_logic
    );
end HALF_ADDER_vlg_check_tst;
