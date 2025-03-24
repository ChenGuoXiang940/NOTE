library verilog;
use verilog.vl_types.all;
entity CONCATENATION_vlg_sample_tst is
    port(
        A               : in     vl_logic_vector(7 downto 0);
        HIGH_BYTE       : in     vl_logic_vector(7 downto 0);
        LOW_BYTE        : in     vl_logic_vector(7 downto 0);
        sampler_tx      : out    vl_logic
    );
end CONCATENATION_vlg_sample_tst;
