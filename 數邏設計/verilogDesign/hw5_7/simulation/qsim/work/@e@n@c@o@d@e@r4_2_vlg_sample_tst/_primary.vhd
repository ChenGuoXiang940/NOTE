library verilog;
use verilog.vl_types.all;
entity ENCODER4_2_vlg_sample_tst is
    port(
        I               : in     vl_logic_vector(3 downto 0);
        sampler_tx      : out    vl_logic
    );
end ENCODER4_2_vlg_sample_tst;
