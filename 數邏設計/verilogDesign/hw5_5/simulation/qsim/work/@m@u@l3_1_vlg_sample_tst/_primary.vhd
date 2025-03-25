library verilog;
use verilog.vl_types.all;
entity MUL3_1_vlg_sample_tst is
    port(
        I               : in     vl_logic_vector(2 downto 0);
        S               : in     vl_logic_vector(1 downto 0);
        sampler_tx      : out    vl_logic
    );
end MUL3_1_vlg_sample_tst;
