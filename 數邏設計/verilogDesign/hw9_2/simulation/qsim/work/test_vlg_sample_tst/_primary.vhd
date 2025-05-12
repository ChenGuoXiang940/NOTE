library verilog;
use verilog.vl_types.all;
entity test_vlg_sample_tst is
    port(
        I               : in     vl_logic_vector(8 downto 0);
        sampler_tx      : out    vl_logic
    );
end test_vlg_sample_tst;
