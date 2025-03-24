library verilog;
use verilog.vl_types.all;
entity PRIORITY_vlg_sample_tst is
    port(
        A               : in     vl_logic;
        B               : in     vl_logic;
        C               : in     vl_logic;
        X               : in     vl_logic;
        Y               : in     vl_logic;
        sampler_tx      : out    vl_logic
    );
end PRIORITY_vlg_sample_tst;
