(function () {
  // Auto-year in footer
  const yearEl = document.getElementById("year");
  if (yearEl) yearEl.textContent = new Date().getFullYear();

  // Copy booking link helper
  const btn = document.getElementById("copyLinkBtn");
  if (!btn) return;

  btn.addEventListener("click", async (e) => {
    e.preventDefault();

    // Keep this aligned with your Calendly data-url in HTML
    const bookingLink = "https://calendly.com/sangjinyim/15min";

    try {
      await navigator.clipboard.writeText(bookingLink);
      btn.textContent = "Copied!";
      setTimeout(() => (btn.textContent = "Copy booking link"), 1200);
    } catch {
      // Fallback prompt if clipboard blocked
      window.prompt("Copy this booking link:", bookingLink);
    }
  });
})();