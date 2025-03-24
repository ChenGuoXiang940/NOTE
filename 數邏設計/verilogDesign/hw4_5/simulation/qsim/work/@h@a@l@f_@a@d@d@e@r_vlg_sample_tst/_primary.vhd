library verilog;
use verilog.vl_types.all;
entity HALF_ADDER_vlg_sample_tst is
    port(
        X               : in     vl_logic;
        Y               : in     vl_logic;
        sampler_tx      : out    vl_logic
    );
end HALF_ADDER_vlg_sample_tst;
